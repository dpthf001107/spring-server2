'use client';

import { useState } from "react";
import axios from "axios";

export default function Home() { // 하나만 존재, 익스포트는 퍼블릭을 의미
  const [query, setQuery] = useState("");
  const [isLoading, setIsLoading] = useState(false);
  const [result, setResult] = useState<string | null>(null);
  const [error, setError] = useState<string | null>(null);

  const handleSearch = async () => {
   
    const trimmed = query.trim();

    if (!trimmed) {
      console.log("입력된 텍스트가 없습니다.");
      setResult(null);
      setError("검색어를 입력해 주세요.");
      return;
    }
    alert("버튼클릭"+trimmed);
    setIsLoading(true);
    setResult(null);
    setError(null);

    try {
      // API Gateway를 통한 호출
      // 환경 변수가 있으면 사용하고, 없으면 discovery-server의 외부 포트 사용
      const apiBaseUrl = process.env.NEXT_PUBLIC_API_URL || "http://localhost:8080";
      // /api/soccer/search로 호출 (StripPrefix=2 적용 시 /api/soccer/search → /search)
      const response = await axios.get(`${apiBaseUrl}/api/soccer/search`, {
        params: { keyword: trimmed },
      });

      setResult(JSON.stringify(response.data, null, 2));
      console.log("검색 결과:", response.data);
    } catch (err: any) {
      console.error("검색 중 오류가 발생했습니다.", err);
      const errorMessage = err.response?.data?.message || err.message || "검색 중 오류가 발생했습니다. 콘솔을 확인하세요.";
      setError(errorMessage);
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <div className="flex min-h-screen flex-col bg-white">
      <header className="flex items-center justify-between px-24 py-12">
        <div className="flex items-end gap-1 text-black">
          <span className="text-3xl font-semibold tracking-tight">NEXT</span>
          <span className="text-sm font-medium leading-6">.js</span>
        </div>
        <button className="rounded-full border border-black/10 px-4 py-2 text-sm font-medium text-black/60 transition hover:border-black/20 hover:text-black">
          문의하기
        </button>
      </header>

      <main className="flex flex-1 flex-col items-center justify-center gap-10 px-6 pb-32">
        <h1 className="text-4xl font-semibold tracking-tight text-black">
          무엇을 도와드릴까요?
        </h1>
        <div className="flex w-full max-w-3xl flex-col items-center gap-4">
          <div className="flex w-full items-center gap-3 rounded-full border border-black/10 bg-white px-6 py-4 text-lg shadow-[0_8px_30px_rgba(0,0,0,0.08)] transition focus-within:border-black/20 focus-within:shadow-[0_12px_40px_rgba(0,0,0,0.12)]">
            <svg
              className="h-6 w-6 text-black/40"
              viewBox="0 0 24 24"
              fill="none"
              stroke="currentColor"
              strokeWidth="1.8"
              strokeLinecap="round"
              strokeLinejoin="round"
              aria-hidden="true"
            >
              <line x1="12" y1="5" x2="12" y2="19" />
              <line x1="5" y1="12" x2="19" y2="12" />
            </svg>
            <input
              className="w-full border-none bg-transparent text-black placeholder:text-black/40 focus:outline-none"
              placeholder="무엇이든 물어보세요"
              value={query}
              onChange={(event) => setQuery(event.target.value)}
            />
            <div className="flex items-center gap-3 text-black/40">
              <button
                type="button"
                className="rounded-full p-2 transition hover:bg-black/5 hover:text-black"
                aria-label="음성 입력"
                onClick={handleSearch}
              >
                <svg
                  className="h-6 w-6"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="currentColor"
                  strokeWidth="1.5"
                  strokeLinecap="round"
                  strokeLinejoin="round"
                >
                  <path d="M12 3a3 3 0 0 1 3 3v5a3 3 0 0 1-6 0V6a3 3 0 0 1 3-3z" />
                  <path d="M19 11v1a7 7 0 0 1-14 0v-1" />
                  <line x1="12" y1="19" x2="12" y2="22" />
                  <line x1="9" y1="22" x2="15" y2="22" />
                </svg>
              </button>
              <button
                type="button"
                className="rounded-full p-2 transition hover:bg-black/5 hover:text-black"
                aria-label="전송"
                onClick={handleSearch}
              >
                <svg
                  className="h-6 w-6"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="currentColor"
                  strokeWidth="1.8"
                  strokeLinecap="round"
                  strokeLinejoin="round"
                >
                  <path d="M5 12l7-7 7 7" />
                  <path d="M12 5v14" />
                </svg>
              </button>
            </div>
          </div>
          <p className="text-sm text-black/40">엔터를 눌러 질문을 시작하세요.</p>
          <div className="w-full max-w-3xl text-left text-sm text-black/70">
            {isLoading && (
              <p className="rounded-lg border border-black/10 bg-black/[0.03] px-4 py-3 text-black/70">
                검색 중입니다...
              </p>
            )}
            {!isLoading && error && (
              <p className="rounded-lg border border-red-200 bg-red-50 px-4 py-3 text-red-600">
                {error}
              </p>
            )}
            {!isLoading && result && (
              <pre className="mt-3 max-h-72 overflow-auto rounded-lg border border-black/10 bg-black/[0.03] px-4 py-3 text-left text-sm text-black">
                {result}
              </pre>
            )}
          </div>
        </div>
      </main>
    </div>
  );
}

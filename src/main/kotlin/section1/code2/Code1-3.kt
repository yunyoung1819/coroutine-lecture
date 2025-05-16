package section1.code2

import java.util.concurrent.Executors

fun main() {
    // ExecutorService 생성
    val executorService = Executors.newFixedThreadPool(2)

    // 작업 1 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 1 시작")
        Thread.sleep(1000L)
        println("[${Thread.currentThread().name}] 작업 1 완료")
    }

    // 작업 2 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 2 시작")
        Thread.sleep(1000L)
        println("[${Thread.currentThread().name}] 작업 2 완료")
    }

    // 작업 3 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 3 시작")
        Thread.sleep(1000L)
        println("[${Thread.currentThread().name}] 작업 3 완료")
    }

    // ExecutorService 종료
    executorService.shutdown()
}
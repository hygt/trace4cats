package trace4cats

import cats.data.{EitherT, Kleisli}
import cats.effect.IO

object EitherTTraceInstanceSummonTest {
  type F[x] = Kleisli[IO, Span[IO], x]
  implicitly[Trace[EitherT[F, Unit, *]]]
  implicitly[Trace.WithContext[EitherT[F, Unit, *]]]
}

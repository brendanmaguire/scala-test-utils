package com.dwolla.testutils.mocking

import org.specs2.mock.Mockito

trait WithBehaviorMocking { this: Mockito =>
  implicit class WithBehavior[T](t: T) {
    def withBehavior(body: T => Unit): T = {
      body(t)
      t
    }
  }
}

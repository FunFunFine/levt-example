package levt.pog {

  object Foo{
      override def toString(): String = "Foo from pog"
  }

  object Bar{
      override def toString(): String = "Bar from pog"
  }
}

package levt.zog {
  object Foo{
      override def toString(): String = "Foo from zog"
  }
  object Bar{
      override def toString(): String = "Bar from zog"
  }

  package dog {
    import domain.User
    object bark {
      def apply = User("a dog")
    }
  }
}

import spock.lang.Specification

class FooBarTest extends Specification {

  def testDoSomething() {
    given:
    FooBar fooBar = new FooBar()

    expect:
    "I'm doing nothing" == fooBar.doSomething('nothing')
  }

}

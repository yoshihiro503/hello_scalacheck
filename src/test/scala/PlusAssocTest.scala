import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object PlusAssocTest extends Properties("Plus") {

  property("plus_assoc") = forAll {
    (l : Int, m : Int, n : Int) => l + (m + n) == (l + m) + n
  }

}

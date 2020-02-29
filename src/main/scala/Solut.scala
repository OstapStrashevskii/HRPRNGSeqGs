import java.util.Random

object Solut {
  val randomObj = new Random()
  val maxBinStrLength = 1000.toBinaryString.length
  def randomInt = randomObj.nextInt(1000)

  def makeBinZeroStr(size: Int) = (1 to (maxBinStrLength - size)).map(_ => 0)

  def buildStr = maxBinStrLength

  def main(args: Array[String]) {

    def random = randomInt
    val randStr = random.toBinaryString
    println(random)
    println(randStr)

    val s = randStr.size
    println(s)
    println(makeBinZeroStr(randStr.size))

  }
  //    println(random.toBinaryString)
  //    println(random.toBinaryString)
}

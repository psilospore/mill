object Greet {
  def greet(name: String, prefix: Option[String]): String = prefix match {
    case Some(p) => s"Hello, ${p} ${name}!"
    case None => s"Hello, ${name}!"
  }
}

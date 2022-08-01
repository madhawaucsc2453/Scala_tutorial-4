object q3 {
  def toUpper(name: String): String = {
    name.toUpperCase();
  }

  def toLower(name: String): String = {
    name.toLowerCase();
  }
  def formatNames(name:String)(Index:Int*)(func: String=>String):String={
    if(Index.isEmpty){
      return func(name);
    }

    var tmp="";
    var x=0;
    while(x<name.length()){
      if(Index.contains(x)){
        tmp=tmp+func(name.charAt(x).toString);
      }else{
        tmp = tmp+name.charAt(x).toString;
      }
      x=x+1;
    }
    tmp;
  }
  def main(args:Array[String])
  {
   println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(1)(toUpper));
    println(formatNames("Saman")(0)(toLower));
    println(formatNames("Kumara")(5)(toUpper));


  }
}

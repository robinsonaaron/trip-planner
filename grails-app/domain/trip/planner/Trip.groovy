package trip.planner

class Trip {
  static constraints = {
    name()
  }
  static hasMany = [flights:Flight]
  String name
  
  String toString(){
    name
  }
}

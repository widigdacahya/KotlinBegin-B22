package extensionprop

class TheThing (var thingNae:String, var weught:Double)

val TheThing.getInfo : String
    get() = "This thing's name is $thingNae woth weight as $weught"
fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = true
    var role: String

    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColour = if (auraVisible) "GREEN" else "NONE"
    //println(auraColour)

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 91..99 -> "has a few scratches."
        in 76..90 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 16..75 -> "looks pretty hurt."
        else -> "is in a awful condition!"
    }
    //println("$name $healthStatus")
    if (isImmortal) {
        role = "The Immortal"
    } else {
        role = "Hero"
    }
    println("(HP:$healthPoints)-(AURA:$auraColour) -> $role $name $healthStatus")
}
import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    var rollingBill = arrayOf<Double>()

    var total:Double = 0.0
    var taxedTotal:Double = 0.0
    var recTip:Double = 0.0

    var userEntry:Double = 0.0
    println("Type 0 to Finalize the Bill and Calculate The Total")
    do{
        println("Enter The Price For A Item: ")
        //get the entry from the user
        userEntry = readln().toDouble()
        //add that entry to the list
        rollingBill += userEntry



    }while(userEntry != 0.0)


    //calculate the total
    for (i in rollingBill){
        total += i
    }

    //calculate taxes from total
    val taxesAmount = total * 0.025
    //set taxedTotal to total + taxes
    taxedTotal = total + taxesAmount

    //calculate Tips
    recTip = taxedTotal * 0.175 //17.5% tip

    val finalTotal = taxedTotal + recTip


    //with all variables calculated, format ALL variables to 2 decimal places, and print out the variables in a
// organized manner

    //set the bill format using the java decimal format function
    val billFormat = DecimalFormat("#.##")
    //tell the formatter to round DOWN when possible instead of favoring up
    billFormat.roundingMode = RoundingMode.DOWN

    println("Bill Values: \n")
    println("Total: $${billFormat.format(total)}\nTaxes Amount: $${billFormat.format(taxesAmount)}\nTotal With Taxes: $${billFormat.format(taxedTotal)}\nRecommended Tip: $${billFormat.format(recTip)}\nFinal Total: $${billFormat.format(finalTotal)}")






}
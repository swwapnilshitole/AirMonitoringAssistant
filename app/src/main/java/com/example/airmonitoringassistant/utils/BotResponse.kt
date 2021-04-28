package com.example.airmonitoringassistant.utils

import com.example.airmonitoringassistant.utils.Constants.OPEN_GOOGLE
import com.example.airmonitoringassistant.utils.Constants.OPEN_SEARCH
import com.example.airmonitoringassistant.utils.Constants.SHOW_AQI
import com.example.airmonitoringassistant.utils.Constants.SHOW_ATEMP
import com.example.airmonitoringassistant.utils.Constants.SHOW_OZONE
import com.example.airmonitoringassistant.utils.Constants.SHOW_RESULTS
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            //Flips a coin
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            //Math calculations
            message.contains("solve") -> {
                val equation: String? = message.substringAfterLast("solve")
                return try {
                    val answer = SolveMath.solveMath(equation ?: "0")
                    "$answer"

                } catch (e: Exception) {
                    "Sorry, I can't solve that."
                }
            }

            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there!"
                    1 -> "Sup"
                    2 -> "Buongiorno!"
                    else -> "error" }
            }

            //1
            message.contains("what is air pollution") -> {
                val chat = "Contamination of air to make it harmful for living beings is called air pollution."
                chat.toString()
            }

            //2
            message.contains("what is the benefit of ozone layer") -> {
                val chat = "Ozone layer prevents harmful ultraviolet radiations from the sun from entering our atmosphere."
                chat.toString()
            }

            //3
            message.contains("what are the natural causes of air pollution") -> {
                val chat = "Smoke and dust from forest fire and volcano pollute the air are the natural causes of air pollution."
                chat.toString()
            }

            //4
            message.contains("what is smog") -> {
                val chat = "A mixture of smoke and fog is called smog."
                chat.toString()
            }

            //5
            message.contains("what is acid rain") -> {
                val chat = "When rainwater comes along with acid, it is called acid rain."
                chat.toString()
            }

            //6
            message.contains("what is global warming") -> {
                val chat = "Overall increase temperature of earth is called global warming."
                chat.toString()
            }

            //7
            message.contains("what is water pollution") -> {
                val chat = "Contamination of water to make it harmful for living beings is called water pollution."
                chat.toString()
            }

            //8
            message.contains("how are dust particles added in air") -> {
                val chat = "There are many sources of dust particles, e.g. stone quarries, mines, power plants, construction sites, etc."
                chat.toString()
            }

            //9
            message.contains("which health problem arises by air pollution") -> {
                val chat = "Respiratory problems like asthma, breathlessness, bronchitis, etc."
                chat.toString()
            }

            //10
            message.contains("what does spm stand for") -> {
                val chat = "Solid particulate matter."
                chat.toString()
            }

            //11
            message.contains("name the agents that pollute air and water") -> {
                val chat = "Pollutants"
                chat.toString()
            }

            //12
            message.contains("name the main air polluting gases") -> {
                val chat = "Sulphur dioxide, carbon monoxide and nitrogen oxides."
                chat.toString()
            }

            //13
            message.contains("what are the main causes of air pollution") -> {
                val chat = "Following are the main causes of air pollution:\n" +
                        "\n" +
                        "Poisonous gases which are expelled by various industries.\n" +
                        "Gases emitted by vehicles.\n" +
                        "Smoke and dust which are arising day by day due to human activities.\n" +
                        "Smoke emitted by forest fire."
                chat.toString()
            }

            //14
            message.contains("what do you mean by air pollution") -> {
                val chat = "When air is contaminated by unwanted substances which have a harmful effect on both living and nonliving things then it is referred as air pollution."
                chat.toString()
            }

            //15
            message.contains("name three alternative sources of energy which do not cause any pollution") -> {
                val chat = "Wind energy, solar energy and hydropower."
                chat.toString()
            }

            //16
            message.contains("which of the following is a major source of water pollution") -> {
                val chat = "DDT"
                chat.toString()
            }

            //17
            message.contains("the phenomenon of marble cancer is due to") -> {
                val chat = "acid rain"
                chat.toString()
            }

            //18
            message.contains("which gas is the major pollutant of air") -> {
                val chat = "Carbon monoxide"
                chat.toString()
            }

            //19
            message.contains("the solid or liquid particles dispersed in the air are called") -> {
                val chat = "aerosols"
                chat.toString()
            }

            //20
            message.contains("the Taj Mahal is being affected due to") -> {
                val chat = "air pollution"
                chat.toString()
            }

            //21
            message.contains("greenhouse gas is") -> {
                val chat = "methane and carbon dioxide"
                chat.toString()
            }

            //22
            message.contains("the contamination of natural environment is known as") -> {
                val chat = "pollution"
                chat.toString()
            }

            //23
            //message.contains("pollution") -> {
                //val chat = "pollutants"
                //chat.toString()
           // }

            //24
            message.contains("ideal temperature for humans") -> {
                val chat = "70 degrees Fahrenheit"
                chat.toString()
            }

            //25
            message.contains("mq6") -> {
                val chat = "This is a simple-to-use liquefied petroleum gas (LPG) sensor, suitable for sensing LPG (composed of mostly propane and butane) concentrations in the air. The MQ-6 can detect gas concentrations anywhere from 200 to 10000ppm. This sensor has a high sensitivity and fast response time."
                chat.toString()
            }

            //26
            message.contains("mq9") -> {
                val chat = "The Grove - Gas Sensor(MQ9) module is useful for gas leakage detection (in home and industry). It is suitable for detecting Carbon Monoxide, Coal Gas, Liquefied Gas. Due to its high sensitivity and fast response time, measurements can be taken as soon as possible. The sensitivity of the sensor can be adjusted by using the potentiometer.\n" +
                        "\n"
                chat.toString()
            }

            //27
            message.contains("temperature sensor") -> {
                val chat = "A temperature sensor is an electronic device that measures the temperature of its environment and converts the input data into electronic data to record, monitor, or signal temperature changes."
                chat.toString()
            }

            //28
            message.contains("iot") -> {
                val chat = "The Internet of things (IoT) describes the network of physical objects, things that are embedded with sensors, software, and other technologies for the purpose of connecting and exchanging data with other devices and systems over the Internet."
                chat.toString()
            }

            //29
            message.contains("our project") -> {
                val chat = "It's an IOT based project to measure harmful pollutants in air by using relavant sensors and notifying user through text messages,mails if the levels are Harmful or the user can check it directly on our App and Website and also ask relavant Questions to our ChatBot."
                chat.toString()
            }

            //30
            message.contains("tell me about you") -> {
                val chat = "I am Android ChatBot Build using Kotlin, You can ask me your Queries"
                chat.toString()
            }

            //31
            message.contains("what is kotlin") -> {
                val chat = "Kotlin is a general purpose, free, open source, statically typed ?pragmatic? programming language initially designed for the JVM (Java Virtual Machine) and Android that combines object-oriented and functional programming features. It is focused on interoperability, safety, clarity, and tooling support."
                chat.toString()
            }

            //32
           // message.contains("show me live readings") -> {
              //  val chat = "http://iotbabycare.com/iot_airmnr/login.php"
                //chat.toString()
           // }

            //33
            message.contains("ambulance number") -> {
                val chat = "108"
                chat.toString()
            }

            //34
            message.contains("dos to help you survive smog and pollution situation") -> {
                val chat = "1. Stay indoor as much as possible\n" +
                        "2. Wear a mask whenever you go out. and, wear the right masks with respirators\n" +
                        "3. Place air purifying plants like Tulsi, spider plant, aloe vera in homes and offices to increase in door air quality.\n" +
                        "4. stay hydrated. Drink more water to flush out toxins and harmful particles from body.\n" +
                        "5. Start carpooling, public transport to reduce number of vehicles plying on road.\n" +
                        "6. Follow a diet rich in anti oxidants, nutrients to detoxify and improve immunity.\n" +
                        "7. Food such as fatty fish, pineapple, kiwi, onion and peppers help as Natural anti-allergics \n" +
                        "8. Avoid smoking.\n" +
                        "9. keep proper check on pollution of vehicles."
                chat.toString()
            }

            //35
            message.contains("don'ts to survive smog and pollution situation") -> {
                val chat = "1. Avoid outdoor activities, physical exercise in morning \n" +
                        "2. Do not burn garbage, plastics and other discarded items \n" +
                        "3. Avoid using the bigger roads with more traffic.\n" +
                        "4. Avoid going to areas with heavy smoke or dust."
                chat.toString()
            }

            //bye
            message.contains("bye") -> {
                when (random) {
                    0 -> "bye!"
                    1 -> "see ya!"
                    2 -> "see you later!"
                    else -> "error"
                }
            }

            //36
            message.contains("safe co level for living beings") -> {
                val chat = "Safe CO level is below 70 ppm. As CO levels increase and remain above 70 ppm, symptoms become more noticeable and can include headache, fatigue and nausea"
                chat.toString()
            }

            //33
            message.contains("what are the dangers of lpg") -> {
                val chat = "LPG may leak as a gas or a liquid. If the liquid leaks it will quickly evaporate and form a relatively large cloud of gas which will drop to the ground, as it is heavier than air. LPG vapours can run for long distances along the ground and  can collect in drains or basements. When the gas meets a source of ignition it can burn or explode."
                chat.toString()
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "I'm hungry..."
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }

            //What time is it?
            message.contains("time") && message.contains("?")-> {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))

                date.toString()
            }

            //Open Google
            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //Show Results
            message.contains("show") && message.contains("results")-> {
                SHOW_RESULTS
            }

            //AQI
            message.contains("show") && message.contains("air quality index")-> {
                SHOW_AQI
            }

            //Ozone map
            message.contains("show") && message.contains("ozone map")-> {
                SHOW_OZONE
            }

            //average annual temp
            message.contains("show") && message.contains("average annual temperature")-> {
                SHOW_ATEMP
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "Idk"
                    else -> "error"
                }
            }
        }
    }
}
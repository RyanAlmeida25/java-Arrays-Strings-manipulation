/*
Crie uma função chamada simulateDasylirionGrowth que recebe initialHeight, days, dailyGrowth e waterSupply como seus parâmetros.

A função simula o crescimento de uma planta Dasylirion observada por uma coruja noturna perto de uma nascente. Ela deve usar um loop para simular o crescimento da planta ao longo de um número especificado de dias, considerando a taxa de crescimento diário e o consumo de água.

Siga estes passos para implementar a função:

    Use um loop para iterar por cada dia da simulação.
    Incremente a altura da planta pela taxa de crescimento diário (convertendo milímetros para centímetros).
    Diminua o suprimento de água em 50 mililitros por dia (o consumo de água da planta).
    Se o suprimento de água chegar a 0, pare o crescimento da planta pelos dias restantes.
    Use operadores básicos de incremento e decremento para atualizar a altura da planta e o suprimento de água.

Parâmetros:

    initialHeight (int): A altura inicial da planta Dasylirion em centímetros.
    days (int): O número de dias para simular o crescimento.
    dailyGrowth (int): O crescimento diário da planta em milímetros.
    waterSupply (int): O suprimento inicial de água da nascente em mililitros.

A função retorna uma mensagem de string com as seguintes informações:

    A altura final da planta em centímetros (arredondada para 2 casas decimais)
    O suprimento de água restante em mililitros
    Uma mensagem da perspectiva da coruja sobre o crescimento da planta

Nota: Certifique-se de usar a conversão de tipo apropriada quando necessário, especialmente ao converter milímetros para centímetros.
*/

import java.text.DecimalFormat;

class SimulateDasylirionGrowth {
    public static String simulateDasylirionGrowth(int initialHeight, int days, int dailyGrowth, int waterSupply) {
        double currentHeight = initialHeight;
        int remainingWater = waterSupply;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int day = 0; day < days; day++) {
            if (remainingWater > 0) {
                currentHeight += dailyGrowth / 10.0;
                remainingWater -= 50;
            } else {
                break;
            }
        }

        if (remainingWater < 0) {
            remainingWater = 0;
        }

        String finalHeight = df.format(currentHeight);
        String message = "";

        if (currentHeight > initialHeight * 1.5) {
            message = "Hoot hoot! The Dasylirion has grown impressively tall!";
        } else if (currentHeight > initialHeight * 1.2) {
            message = "Hoot! The Dasylirion has shown good growth.";
        } else {
            message = "Hoot... The Dasylirion's growth was limited.";
        }

        return "Final height: " + finalHeight + " cm, Remaining water: " + remainingWater + " ml. " + message;
    }
}

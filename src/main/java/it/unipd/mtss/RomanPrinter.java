////////////////////////////////////////////////////////////////////
// Valeri Mihail Belenkov 2068232
// Matteo Piron 2076044
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        if(romanNumber.equals("Invalid Roman Number Value")){
            return "Invalid Roman Number Value";
        }
        String[] I = {" _____ ",
                      "|_   _|",
                      "  | |  ",
                      "  | |  ",
                      " _| |_ ",
                      "|_____|"};
        String[] V = {"__      __",
                    "\\ \\    / /",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                     "   \\  /   ",
                     "    \\/    "};
        String[] X = {"__  __",
                    "\\ \\/ /",
                    " \\  / ",
                     "  ><  ",
                    " /  \\ ",
                    "/_/\\_\\"};
        String[] L = {" _    ",
                      "| |   ",
                      "| |   ",
                      "| |   ",
                      "| |__ ",
                      "|____|"};
        String[] C = {"  ____  ",
                      " / ___| ",
                      "| |     ",
                      "| |     ",
                      "| |___  ",
                     " \\____| "};
        String[] D = {" ____  ",
                      "|  _ \\ ",
                      "| | | |",
                      "| | | |",
                      "| |_| |",
                      "|____/ "};
        String[] M = {" __  __ ",
                      "|  \\/  |",
                      "| \\  / |",
                      "| |\\/| |",
                      "| |  | |",
                      "|_|  |_|"};

        String[] tmp_result = {"","","","","","",""};

        for(int i=0;i<romanNumber.length();i++){
            switch(romanNumber.substring(i,i+1)){
                case "M":
                    tmp_result[0] += M[0];
                    tmp_result[1] += M[1];
                    tmp_result[2] += M[2];
                    tmp_result[3] += M[3];
                    tmp_result[4] += M[4];
                    tmp_result[5] += M[5];
                    break;
                case "D":
                    tmp_result[0] += D[0];
                    tmp_result[1] += D[1];
                    tmp_result[2] += D[2];
                    tmp_result[3] += D[3];
                    tmp_result[4] += D[4];
                    tmp_result[5] += D[5];
                    break;
                case "C":
                    tmp_result[0] += C[0];
                    tmp_result[1] += C[1];
                    tmp_result[2] += C[2];
                    tmp_result[3] += C[3];
                    tmp_result[4] += C[4];
                    tmp_result[5] += C[5];
                    break;
                case "L":
                    tmp_result[0] += L[0];
                    tmp_result[1] += L[1];
                    tmp_result[2] += L[2];
                    tmp_result[3] += L[3];
                    tmp_result[4] += L[4];
                    tmp_result[5] += L[5];
                    break;
                case "X":
                    tmp_result[0] += X[0];
                    tmp_result[1] += X[1];
                    tmp_result[2] += X[2];
                    tmp_result[3] += X[3];
                    tmp_result[4] += X[4];
                    tmp_result[5] += X[5];
                    break;
                case "V":
                    tmp_result[0] += V[0];
                    tmp_result[1] += V[1];
                    tmp_result[2] += V[2];
                    tmp_result[3] += V[3];
                    tmp_result[4] += V[4];
                    tmp_result[5] += V[5];
                    break;
                case "I":
                    tmp_result[0] += I[0];
                    tmp_result[1] += I[1];
                    tmp_result[2] += I[2];
                    tmp_result[3] += I[3];
                    tmp_result[4] += I[4];
                    tmp_result[5] += I[5];
                    break;
            }
        }
    
        String result = "";
        result = String.join("\n", tmp_result);
        //for(String layer : tmp_result){
        //    result += layer + "\n";
        //}
        
        return result;
    }
}


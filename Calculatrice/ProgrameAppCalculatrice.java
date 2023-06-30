package Calculatrice;

public class ProgrameAppCalculatrice {

    public static Double egal(String calcul) {
    Double result = 0.0;
    if (calcul.contains("+")) {
        String[] opperante = calcul.split("\\+");
        String a = opperante[0];
        String b = opperante[1];
        result = Double.parseDouble(a) + Double.parseDouble(b);
        return result;
    }
    else if (calcul.contains("-")) {
        String[] opperante = calcul.split("-");
        String a = opperante[0];
        String b = opperante[1];
        result = Double.parseDouble(a) - Double.parseDouble(b);
        return result;
    }
    else if (calcul.contains("*")) {
        String[] opperante = calcul.split("\\*");
        String a = opperante[0];
        String b = opperante[1];
        result = Double.parseDouble(a) * Double.parseDouble(b);
        return result;
    }
    else if (calcul.contains("x")) {
        String[] opperante = calcul.split("x");
        String a = opperante[0];
        String b = opperante[1];
        result = Double.parseDouble(a) * Double.parseDouble(b);
        return result;
    }
    else if (calcul.contains("/")) {
        String[] opperante = calcul.split("/");
        String a = opperante[0];
        String b = opperante[1];
        result = Double.parseDouble(a) / Double.parseDouble(b);
        return result;
    }
    Double egal = result;
    return egal;
  }
}
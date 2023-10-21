package control;

class Control {
    int a = 1;
    static int b = 1;
    int c = a + b;
    int d = c;
    // tuong duong d = 2;

    public int setValue(int param) {
        param += 3;
        // param = param + 3;
        return param;
    }

    public static void main(String[] args) {
        Control control = new Control();
        //boolean isControlObject = control instanceof Control;
        boolean isControlObject = false;
        if (control instanceof Control) {
            isControlObject = true;
        }
        System.out.println("isControlObject = " + isControlObject);
        int param = 2;
        System.out.println("param = " + param);
        int paramChanged = control.setValue(param);
        System.out.println("paramChanged = " + paramChanged);
        System.out.println("param = " + param);

        // In ra consolog gia tri tu 1 den 10
        //  FOR
        int i = 0;
        for (; i < 11; i = i + 2) {
            System.out.println(i);
        }

        // In ra consolog gia tri tu 1 den 5
        //  FOR
        System.out.println("In ra consolog gia tri tu 1 den 5");
        final int MAX = 11;
        int j = 1;
        for (; j < MAX; j++) {
            System.out.println(j);
            if (j == 5) {
                break;
            }
        }

        // In ra consolog gia tri tu 1 den 5
        //  FOR
        System.out.println("In ra consolog gia tri la so chan");
        int k = 0;
        for (; k < MAX; k++) {
            // Khi k la so le thi khong xu ly cau lenh System.out.println(k);
            if (k%2 != 0) {
                continue;
            }
            System.out.println(k);
        }

        System.out.println("WHILE In ra consolog gia tri la so chan");
        k = 0;
        while (k < MAX) {
            if (k%2 != 0) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}

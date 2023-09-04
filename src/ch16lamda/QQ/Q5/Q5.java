package ch16lamda.QQ.Q5;

public class Q5 {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(()-> {
            System.out.println("ok click");

        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()-> {
            System.out.println("Cancel click");

        });
        btnCancel.click();

    }

}

class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

}

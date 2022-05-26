package com.lambda;

interface Drawable {

    public void draw();
}

class Testdrawable {

    public static void main(String[] args) {

        int width = 20;

        Drawable d = new Drawable() {

            public void draw() {
                System.out.println("the width is :" + width);
            }
        };

        d.draw();

    }
}
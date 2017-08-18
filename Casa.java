class Casa
{
    //variables de instancia //
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
   // Constructor //
   Casa(){
       ventana = new Circle();
       techo = new Triangle();
       pared = new Square();
       puerta = new Square();
   }
   
   // Mètodos //
   void dibujate(){
       ventana.makeVisible();
       techo.makeVisible();
       pared.makeVisible();
       puerta.makeVisible();
   }
   
   void acomodate()
   {
       // Colocar los objetos en la posiciòn que les corresponde //
       
       techo.changeSize(100,130);
       techo.moveHorizontal(100);
       techo.moveVertical(50);
             
       ventana.changeSize(35);
       ventana.moveHorizontal(115);
       ventana.moveVertical(55);  
       
       pared.changeSize(115);
       pared.moveHorizontal(32);
       pared.moveVertical(115);
              
       puerta.changeSize(50);
       puerta.moveHorizontal(65);
       puerta.moveVertical(180);
   }
   
   void color(){
       techo.changeColor("green");
       ventana.changeColor("red");
       pared.changeColor("black");
       puerta.changeColor("blue");
}
}

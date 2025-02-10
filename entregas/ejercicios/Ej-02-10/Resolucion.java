class Resolucion {
   int witdh;;
   int height;

   public Resolucion(int width, int height) {
      this.witdh = width;
      this.height = height;
   }

   public int obtenerAncho() {
      return witdh;
   }

   public int obtenerAlto() {
      return height;
   }

   public int partirResolucion() {
      return witdh / 2;
   }
}

public enum TipoConta {
   CC("Corrente"),
   CP("Poupança");

   private String tipo;

   TipoConta(String tipo) {
      this.tipo = tipo;
   }

   public String getTipo() {
      return tipo;
   }
}

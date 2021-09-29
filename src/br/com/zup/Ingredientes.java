package br.com.zup;

public class Ingredientes {
        private String escolhaIngredientes;

        public Ingredientes() {
        }

        public Ingredientes(String escolhaIngredientes) {
                this.escolhaIngredientes = escolhaIngredientes;
        }

        public String getEscolhaIngredientes() {
                return escolhaIngredientes;
        }

        public void setEscolhaIngredientes(String escolhaIngredientes) {
                this.escolhaIngredientes = escolhaIngredientes;
        }
        @Override
        public String toString() {
                StringBuilder retornoIngredientes = new StringBuilder();
                retornoIngredientes.append(escolhaIngredientes);
                return retornoIngredientes.toString();
        }
}

package br.com.dio.desafio.dominio;

public class mentoria {
    public class Mentoria {
        private String titulo;
        private String descricao;
        private LocalDate data;

        public Mentoria() {
        }

        public String getTitulo() {
            return titulo;
        }
        public class Mentoria extends Conteudo{

            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }
            private LocalDate data;

            public String getDescricao() {
                return descricao;
                @Override
                public double calcularXp() {
                    return XP_PADRAO + 20d;
                }

                public void setDescricao(String descricao) {
                    this.descricao = descricao;
    public Mentoria() {
                    }

                    public LocalDate getData() {
                        @@ -37,8 +25,8 @@ public void setData(LocalDate data) {
                            @Override
                            public String toString() {
                                return "Mentoria{" +
                                        "titulo='" + titulo + '\'' +
                                        ", descricao='" + descricao + '\'' +
                                        "titulo='" + getTitulo() + '\'' +
                                        ", descricao='" + getDescricao() + '\'' +
                                        ", data=" + data +
                                        '}';
                            }
}

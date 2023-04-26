package br.com.dio.desafio.dominio;
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    public class Curso extends Conteudo{

        public Curso() {
        }

        public String getTitulo() {
            return titulo;
        }
        private int cargaHoraria;

        public void setTitulo(String titulo) {
            this.titulo = titulo;
            @Override
            public double calcularXp() {
                return XP_PADRAO * cargaHoraria;
            }

            public String getDescricao() {
                return descricao;
    public Curso() {
                }

                public void setDescricao(String descricao) {
                    this.descricao = descricao;
                }

                public int getCargaHoraria() {
                    return cargaHoraria;
                    @@ -35,8 +24,8 @@ public void setCargaHoraria(int cargaHoraria) {
                        @Override
                        public String toString() {
                            return "Curso{" +
                                    "titulo='" + titulo + '\'' +
                                    ", descricao='" + descricao + '\'' +
                                    "titulo='" + getTitulo() + '\'' +
                                    ", descricao='" + getDescricao() + '\'' +
                                    ", cargaHoraria=" + cargaHoraria +
                                    '}';
                        }



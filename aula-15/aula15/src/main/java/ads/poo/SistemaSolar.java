package ads.poo;

public enum SistemaSolar {

    MERCURIO (1, "mercúrio"),
    VENUS(2, "vênus"),
    TERRA(3, "terra"),
    MARTE(4, "marte"),
    JUPITER(5, "jupiter"),
    SATURNO(6, "saturno"),
    URANO(7, "urano"),
    NETUNO(8, "netuno");

    public final int posicao;
    public final String extenso;


    SistemaSolar(int posicao, String extenso) {
        this.posicao = posicao;
        this.extenso = extenso;
    }

    public static SistemaSolar getByPosicao(int codigo){
        for(SistemaSolar planeta : SistemaSolar.values()){
            if(planeta.posicao == codigo){
                return planeta;
            }
        }
        throw new IllegalArgumentException("posição inválida");
    }



    @Override
    public String toString() {
        return  extenso + " = posição " + posicao;
    }
}

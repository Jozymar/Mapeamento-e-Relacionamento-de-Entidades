package com.ifpb.mapeamento.cenario03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author jozimar
 */
public class App {

    public static void main(String[] args) {

        MaterialDidatico materialDidatico = new MaterialDidatico("EUA", 12345678, "Segurança de Dados", Date.from(Instant.now()), "Segurança", "Danilo", TipoMaterialDidatico.APOSTILA, true, 200);

        MaterialDidatico materialDidaticoUp = new MaterialDidatico("EUA", 12345678, "Segurança de Dados", Date.from(Instant.now()), "Segurança", "Danilo", TipoMaterialDidatico.VIDEOAULA, true, 100);

        MaterialDidaticoDao materialDidaticoDao = new MaterialDidaticoDao();
        materialDidaticoDao.salvar(materialDidatico);
        //materialDidaticoDao.atualizar(materialDidaticoUp
        //materialDidaticoDao.excluir(materialDidaticoUp);
    }

}

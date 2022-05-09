package Datos;

import java.io.Serializable;

public class General  {

        Guardarycargar guar = new Guardarycargar();

        public static Partidas modelotransferencia = new Partidas();

        public void guardar(){                
                guar.serializarObjeto("usuario.txt", modelotransferencia);
        }

        public Partidas cargar(){
                modelotransferencia = guar.cargarObjeto("usuario.txt");
               
               return this.modelotransferencia;
        }
}

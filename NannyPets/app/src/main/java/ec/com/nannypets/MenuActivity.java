package ec.com.nannypets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgLogOut;
    ImageView imgPerfil;
    LinearLayout lytMiPerfil;
    LinearLayout lytMisMascotas;
    LinearLayout lytAgendaParaCampeon;
    LinearLayout lytVacuna;
    LinearLayout lytAlimentacion;
    LinearLayout lytOpinion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imgLogOut = findViewById(R.id.imgLogOut);
        imgLogOut.setOnClickListener(this);
        imgPerfil = findViewById(R.id.imgPerfil);
        imgPerfil.setOnClickListener(this);
        lytMiPerfil = findViewById(R.id.lytMiPerfil);
        lytMiPerfil.setOnClickListener(this);
        lytMisMascotas = findViewById(R.id.lytMisMascotas);
        lytMisMascotas.setOnClickListener(this);
        lytAgendaParaCampeon= findViewById(R.id.lytAgendaParaCampeon);
        lytAgendaParaCampeon.setOnClickListener(this);
        lytVacuna = findViewById(R.id.lytVacuna);
        lytVacuna.setOnClickListener(this);
        lytAlimentacion = findViewById(R.id.lytAlimentacion);
        lytAlimentacion.setOnClickListener(this);
        lytOpinion = findViewById(R.id.lytOpinion);
        lytOpinion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgLogOut:
                desvincularLogin();
                break;
            case R.id.imgPerfil:
                mostrarActividadPerfil();
                break;
            case R.id.lytMiPerfil:
                mostrarActividadPerfil();
                break;
            case R.id.lytMisMascotas:
                mostrarActividadGeneral("MisMascotas");
                break;
            case R.id.lytAgendaParaCampeon:
                mostrarActividadGeneral("Agenda para campeón");
                break;
            case R.id.lytVacuna:
                mostrarActividadGeneral("calendario vacuna");
                break;
            case R.id.lytAlimentacion:
                mostrarActividadGeneral("alimentación");
                break;
            case R.id.lytOpinion:
                mostrarActividadGeneral("opinion");
                break;
        }
    }

    private void mostrarActividadGeneral(String texto) {
        Log.e(">>>>", "Usted dio click en la actividad "+texto);
    }

    private void mostrarActividadPerfil() {
        Log.e(">>>>", "Mostrar actividad del perfil");
    }

    private void desvincularLogin() {
        Log.e(">>>>", "Esta deslogueado");
    }
}
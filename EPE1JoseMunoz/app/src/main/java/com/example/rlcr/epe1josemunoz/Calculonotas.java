package com.example.rlcr.epe1josemunoz;
//This program is free software: you can redistribute it and/or modify
//        it under the terms of the GNU General Public License as published by
//        the Free Software Foundation, either version 3 of the License, or
//        (at your option) any later version.
//
//        This program is distributed in the hope that it will be useful,
//        but WITHOUT ANY WARRANTY; without even the implied warranty of
//        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//        GNU General Public License for more details.
//
//        You should have received a copy of the GNU General Public License
//        along with this program.  If not, see <http://www.gnu.org/licenses/>.
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.rlcr.epe1josemunoz.R.layout.activity_calculonotas;

public class Calculonotas extends AppCompatActivity {
    EditText etepr1;
    EditText etepe1;
    EditText etepr2;
    EditText etepe2;
    EditText eteva1;
    EditText eteva2;
    EditText eteva3;
    EditText eteva4;
    ImageButton button;
    TextView tvresult;
 ImageButton acerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(activity_calculonotas);

        this.etepr1=(EditText)findViewById(R.id.etepr1);
        this.etepe1=(EditText)findViewById(R.id.etepe1);
        this.etepr2=(EditText)findViewById(R.id.etepr2);
        this.etepe2=(EditText)findViewById(R.id.etepe2);
        this.eteva1=(EditText)findViewById(R.id.eteva1);
        this.eteva2=(EditText)findViewById(R.id.eteva2);
        this.eteva3=(EditText)findViewById(R.id.eteva3);
        this.eteva4=(EditText)findViewById(R.id.eteva4);
        this.tvresult=(TextView)findViewById(R.id.tvresult);
        button=(ImageButton)findViewById(R.id.button);
        acerca=(ImageButton)findViewById(R.id.acerca1);
        acerca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent acerca  = new Intent (Calculonotas.this, credito.class);
                startActivity(acerca);

            }
        });
       button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Toast toast = Toast.makeText(getBaseContext(), "Calculando...", Toast.LENGTH_SHORT);
               Toast toast2 = Toast.makeText(getBaseContext(), "Aprobado", Toast.LENGTH_LONG);
               Toast toast3 = Toast.makeText(getBaseContext(), "Tienes que dar examen", Toast.LENGTH_LONG);
               Toast toast4 = Toast.makeText(getBaseContext(), "Debes llenar todos los campos", Toast.LENGTH_SHORT);
               Toast toast5 = Toast.makeText(getBaseContext(), "Nota debe ser inferior a 70", Toast.LENGTH_SHORT);
               toast.show();
                String epr1 = etepr1.getText().toString();
                String epe1 = etepe1.getText().toString();
               String epr2 = etepr2.getText().toString();
               String epe2 = etepe2.getText().toString();
                String eva1 = eteva1.getText().toString();
               String eva2 = eteva2.getText().toString();
               String eva3 = eteva3.getText().toString();
               String eva4 = eteva4.getText().toString();
               if (etepr1.length()<2)
                        toast4.show();
               else
                if (etepe1.length()<2)
                    toast4.show();
                else
                if (etepr2.length()<2)
                    toast4.show();
                else
                if (etepe2.length()<2)
                    toast4.show();
                else
                if (eteva1.length()<2)
                    toast4.show();
                else
                if (eteva2.length()<2)
                    toast4.show();
                else
                if (eteva3.length()<2)
                    toast4.show();
                else
                if (eteva4.length()<2)
                    toast4.show();
                else {

                    int nota1 = Integer.parseInt(epr1);
                    int nota2 = Integer.parseInt(epe1);
                    int nota3 = Integer.parseInt(epr2);
                    int nota4 = Integer.parseInt(epe2);
                    int evas1 = Integer.parseInt(eva1);
                    int evas2 = Integer.parseInt(eva2);
                    int evas3 = Integer.parseInt(eva3);
                    int evas4 = Integer.parseInt(eva4);
                    if (nota1 > 70)
                    toast5.show();
                    else
                    if (nota2 > 70)
                        toast5.show();
                    else
                    if (nota3 > 70)
                        toast5.show();
                    else
                    if (nota4 > 70)
                        toast5.show();
                    else
                    if (evas1 > 70)
                        toast5.show();
                    else
                    if (evas2 > 70)
                        toast5.show();
                    else
                    if (evas3 > 70)
                        toast5.show();
                    else
                    if (evas4 > 70)
                        toast5.show();
                    else
                        {
                        double notaeva=evas1+evas2+evas3+evas4;
                        double notaevas=notaeva/4;
                        double cnota1 = nota1 * 0.1;
                        double cnota2 = nota2 * 0.15;
                        double cnota3 = nota3 * 0.2;
                        double cnota4 = nota4 * 0.25;
                        double cnota5 = notaevas * 0.3;

                        double suma = cnota1 + cnota2 + cnota3 + cnota4 + cnota5;
                        tvresult.setText(Double.toString(suma));

                        if (suma > 54.9)

                        {
                            toast2.show();
                        } else
                            toast3.show();

                    }
                }

       }


       });
    }



}

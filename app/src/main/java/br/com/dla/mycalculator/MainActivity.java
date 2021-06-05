package br.com.dla.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    //VARIAVEIS

    //texto
    String process;
    //textos
    TextView text_result, text_expres, text_expresTmp;
    //botões numericos e outros
    TextView btn_num0, btn_num1, btn_num2, btn_num3, btn_num4, btn_num5, btn_num6, btn_num7, btn_num8, btn_num9, btn_ponto;
    //botões de funções
    TextView btn_limpar, btn_result, btn_mult, btn_div, btn_soma, btn_sub;
    LinearLayout btn_apagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ASSOCIANDO VARIAVEL A ID

        //textos
        text_result = findViewById(R.id.text_result);
        text_expres = findViewById(R.id.text_expres);
        text_expresTmp = findViewById(R.id.text_expresTmp);
        //botões numericos e ponto
        btn_num0 = findViewById(R.id.btn_num0);
        btn_num1 = findViewById(R.id.btn_num1);
        btn_num2 = findViewById(R.id.btn_num2);
        btn_num3 = findViewById(R.id.btn_num3);
        btn_num4 = findViewById(R.id.btn_num4);
        btn_num5 = findViewById(R.id.btn_num5);
        btn_num6 = findViewById(R.id.btn_num6);
        btn_num7 = findViewById(R.id.btn_num7);
        btn_num8 = findViewById(R.id.btn_num8);
        btn_num9 = findViewById(R.id.btn_num9);
        btn_ponto = findViewById(R.id.btn_ponto);
        //botões de funções
        btn_result = findViewById(R.id.btn_result);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_soma = findViewById(R.id.btn_soma);
        btn_sub = findViewById(R.id.btn_sub);
        btn_apagar = findViewById(R.id.btn_apagar);
        btn_limpar = findViewById(R.id.btn_limpar);

        text_expresTmp.setVisibility(View.GONE);

        //FUNÇÕES

        //Limpar tudo
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //definir o campo de expressao visivel e o de espresão temporarios GONE
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);

                //zerar string dos TextViews
                text_expres.setText("");
                text_result.setText("");
            }
        });

        //Numero 0
        btn_num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pegar valor do campo de expressao e atribuir a variavel
                process = text_expres.getText().toString();
                //juntar valor da variavel ao referene ao botão
                String valor = process + "0";
                text_expres.setText(valor);

                //definir o campo de expressao visivel e o de espresão temporarios GONE
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 1
        btn_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "1";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 2
        btn_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "2";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 3
        btn_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "3";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 4
        btn_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "4";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 5
        btn_num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "5";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 6
        btn_num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "6";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 7
        btn_num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "7";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 8
        btn_num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "8";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //Numero 9
        btn_num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "9";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn ponto
        btn_ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + ".";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn soma
        btn_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "+";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn sub
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "-";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn mult
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "×";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn div
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = text_expres.getText().toString();
                String valor = process + "÷";
                text_expres.setText(valor);
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn apagar
        btn_apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView expressao = findViewById(R.id.text_expres);
                //atribuir valor do campo de expresão a uma nova variavel
                String string = expressao.getText().toString();

                //se "string" não está fazio
                if(!string.isEmpty()){
                    //criar um bite = 0
                    byte var0 = 0;
                    //criar um INT para contar e subtrair -1 numero de letras na string
                    int var1 = string.length()-1;
                    //atribuir a variavel txtExpressao o string
                    String txtExpressao = string.substring(var0,var1);
                    expressao.setText(txtExpressao);
                }

                //definir text_result como vazio
                text_result.setText(" ");

                //definir o campo de expressao visivel e o de espresão temporarios GONE
                text_expresTmp.setVisibility(View.GONE);
                text_expres.setVisibility(View.VISIBLE);
            }
        });

        //btn result
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //atribuir valor do campo text_expres para variavel process
                process = text_expres.getText().toString();
                //se processo é vazio
                if(process.equals("")){
                    //mensagem de erro caso calculo invalido
                    Toast.makeText(MainActivity.this, R.string.erro_result, Toast.LENGTH_SHORT).show();
                //se não
                } else {
                    //atribuir a text_expresTmp o valor de process
                    text_expresTmp.setText(process);
                    //substituir caracteres não reconheciveis para o calculo
                    process = process.replaceAll("×","*");
                    process = process.replaceAll("÷","/");

                    //metodo de calculo
                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String finalResult = "";

                    try {
                        Scriptable scriptable = rhino.initStandardObjects();
                        finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                    }catch (Exception e){
                        finalResult="0";
                        Toast.makeText(MainActivity.this, R.string.erro_result, Toast.LENGTH_SHORT).show();
                    }
                    //atribuindo valor ao text_result e zerando text_expres
                    text_result.setText(finalResult);
                    text_expres.setText("");

                    //definindo text_expresTmp como VISIBLE e text_expres como GONE
                    text_expresTmp.setVisibility(View.VISIBLE);
                    text_expres.setVisibility(View.GONE);
                }
            }
        });

    }

}
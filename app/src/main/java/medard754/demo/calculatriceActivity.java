package medard754.demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculatriceActivity extends AppCompatActivity {

    public static String chiffreClick(String s) { return  s;}
    double chiffre=0;
    boolean update=false;
    boolean clickoperateur=false;
    public  String operateur="";
    double value1,value2;
    boolean crunPlus,crunMul,crunMoin,crunDiv,crunMod;
    Calculator calcul=new Calculator();
    String recup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        Button zero=(Button) findViewById(R.id.zero);
        Button un=(Button) findViewById(R.id.un);
        Button deux=(Button) findViewById(R.id.deux);
        Button trois=(Button) findViewById(R.id.trois);
        Button quatre=(Button) findViewById(R.id.quatre);
        Button cinq=(Button) findViewById(R.id.cinq);
        Button six=(Button) findViewById(R.id.six);
        Button sept=(Button) findViewById(R.id.sept);
        Button huit=(Button) findViewById(R.id.huit);
        Button neuf=(Button) findViewById(R.id.neuf);
        Button C=(Button) findViewById(R.id.AC);
        Button vi=(Button) findViewById(R.id.virgule);
        Button plus=(Button) findViewById(R.id.plus);
        Button moins=(Button) findViewById(R.id.moins);
        Button plusMoins=(Button) findViewById(R.id.plusMoins);
        Button fois=(Button) findViewById(R.id.fois);
        Button div=(Button) findViewById(R.id.div);
        Button mod=(Button) findViewById(R.id.mod);
        Button egal=(Button) findViewById(R.id.egal);
        EditText edit=(EditText) findViewById(R.id.edit);
        Calculator calcul=new Calculator();
        zero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("0");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        un.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("1");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        deux.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("2");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        trois.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("3");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        quatre.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("4");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        cinq.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("5");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("6");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        sept.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("7");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        huit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("8");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        neuf.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("9");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        vi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick(",");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }

                    }
                }
        );
        C.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        edit.setText(String.valueOf(""));
                        return false;
                    }
                }
        );
        C.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=edit.getText().toString();
                        //edit.setText(String.valueOf(var));
                        if(var != null && var.length()>0){
                            var=var.substring(0,var.length()-1);
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(""));
                        }
                    }
                }
        );
        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        value1=Integer.parseInt(edit.getText()+"");
                        crunPlus=true;
                        edit.setText(null);
                    };
                }
        );
        moins.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunMoin=true;
                        edit.setText(null);
                    }
                }
        );
        fois.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunMul=true;
                        edit.setText(null);
                    }
                }
        );
        div.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunDiv=true;
                        edit.setText(null);
                    }
                }
        );
        mod.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.valueOf(edit.getText().toString()).doubleValue();
                        double value=value1*0.01;
                        edit.setText(String.valueOf(value));
                    }
                }
        );
        plusMoins.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.valueOf(edit.getText().toString()).doubleValue();
                        double value=value1*(-1);
                        edit.setText(String.valueOf(value));
                    }
                }
        );

        egal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value2=Double.parseDouble(edit.getText()+"");
                        if(crunPlus==true){
                            value2=Double.parseDouble(edit.getText()+"");
                            Calculator var= calcul.addition(value1,value2);
                            edit.setText((CharSequence) var);
                            //edit.setText(value1+value2+"");
                            crunMul=false;
                        }
                        if(crunMoin==true){
                            value2=Double.parseDouble(edit.getText()+"");
                            Calculator var= calcul.soustraction(value1,value2);
                            edit.setText((CharSequence) var);
                            crunMoin=false;
                        }
                        if(crunMul==true){
                            value2=Double.parseDouble(edit.getText()+"");
                            Calculator var= calcul.multiplication(value1,value2);
                            edit.setText((CharSequence) var);
                            crunMul=false;
                        }
                        if(crunDiv==true){
                            Calculator var= calcul.division(value1,value2);
                            edit.setText((CharSequence) var);
                            crunDiv=false;
                        }


                    }
                }
        );
    }

    /*public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.categorie:
                //Toast.makeText(this,"Categorie selected",Toast.LENGTH_LONG).show();
                Intent myIn=new Intent(ListMetsPays.this, ListMetsCategorie.class);
                startActivity(myIn);
                return  true;
            case R.id.login:
                // Toast.makeText(this,"login selected",Toast.LENGTH_LONG).show();
                Intent myIntent=new Intent(ListMetsPays.this,Inscription.class);
                startActivity(myIntent);
                return  true;
            case R.id.quitter:
                onBackPressed();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }*/
    /*Fonction permettant d'arreter l'application*/
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Quitter");
        builder.setIcon(R.drawable.ic_baseline_warning_24);
        builder.setMessage("Etes vous sur de vraiment quitter");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                calculatriceActivity.super.onBackPressed();
            }
        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

}
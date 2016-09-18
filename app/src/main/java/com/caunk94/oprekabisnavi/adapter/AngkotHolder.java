package com.caunk94.oprekabisnavi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.caunk94.oprekabisnavi.MainActivity;
import com.caunk94.oprekabisnavi.R;
import com.caunk94.oprekabisnavi.subActivity.AngkotK32;
import com.caunk94.oprekabisnavi.subActivity.AngkotK32A;

/**
 * Created by syamms on 9/7/16.
 */
public class AngkotHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView imagen;
    TextView nomor;
    TextView rute;
    Context context;

    public AngkotHolder(View v) {
        super(v);
        context = v.getContext();

        imagen = (ImageView) v.findViewById(R.id.imagen);
        nomor = (TextView) v.findViewById(R.id.nombre);
        rute = (TextView) v.findViewById(R.id.rute);

        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final Intent intent;
        switch (getLayoutPosition()){
            case 0:
                intent =  new Intent(context, AngkotK32A.class);
                break;

            case 1:
                intent =  new Intent(context, AngkotK32.class);
                break;

          /*  case 2:
                intent =  new Intent(context, AngkotK33.class);
                break;
            case 3:
                intent =  new Intent(context, AngkotK34.class);
                break;

            case 4:
                intent =  new Intent(context, AngkotK34A.class);
                break;
*/
            default:
                intent =  new Intent(context, MainActivity.class);
                break;
        }
        context.startActivity(intent);

    }

}


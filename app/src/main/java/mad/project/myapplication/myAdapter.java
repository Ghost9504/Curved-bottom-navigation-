package mad.project.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapter extends FirebaseRecyclerAdapter<Words,myAdapter.myviewholder> {
    public myAdapter(@NonNull FirebaseRecyclerOptions<Words> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Words model) {
        holder.English.setText(model.getEnglish());
        holder.Konkani.setText(model.getKonkani());
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.result_card,parent,false);
       return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView Konkani,English;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            Konkani=itemView.findViewById(R.id.konkani);
            English=itemView.findViewById(R.id.english);


        }
    }
}

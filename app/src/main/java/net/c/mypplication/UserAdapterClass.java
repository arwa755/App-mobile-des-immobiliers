package net.c.mypplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapterClass extends RecyclerView.Adapter<UserAdapterClass.ViewHolder> {

    List<EmployeeModelClass> employee;
    Context context;
    DatabaseHelperClass databaseHelperClass;

    public UserAdapterClass(List<EmployeeModelClass> employee, Context context) {
        this.employee = employee;
        this.context = context;
        databaseHelperClass = new DatabaseHelperClass(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.user_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final EmployeeModelClass employeeModelClass = employee.get(position);

        holder.textViewID.setText(Integer.toString(employeeModelClass.getId()));
        holder.editText_ville.setText(employeeModelClass.getVille());
        holder.editText_prix.setText(employeeModelClass.getPrix());
        holder.edittext_surface.setText(employeeModelClass.getSurface());
        holder.edittext_nbPiece.setText(employeeModelClass.getNbPiece());





    }

    @Override
    public int getItemCount() {
        return employee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewID;
        EditText editText_ville;
        EditText editText_prix;
        EditText edittext_surface;
        EditText edittext_nbPiece;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewID = itemView.findViewById(R.id.text_id);
            editText_ville = itemView.findViewById(R.id.edittext_ville);
            editText_prix = itemView.findViewById(R.id.edittext_prix);
            edittext_surface = itemView.findViewById(R.id.edittext_surface);
            edittext_nbPiece = itemView.findViewById(R.id.edittext_nbPiece);


        }
    }
}


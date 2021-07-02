package net.c.mypplication;

import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.widget.Toast;

        import java.util.List;

public class ViewUsereActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_usere);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);

        DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(this);
        List<EmployeeModelClass> employeeModelClasses = databaseHelperClass.getEmployeeList();

        if (employeeModelClasses.size() > 0) {
            UserAdapterClass employeadapterclass = new UserAdapterClass(employeeModelClasses, ViewUsereActivity.this);
            recyclerView.setAdapter(employeadapterclass);
        } else {
            Toast.makeText(this, "There is no immovable in the database", Toast.LENGTH_SHORT).show();
        }

    }
}

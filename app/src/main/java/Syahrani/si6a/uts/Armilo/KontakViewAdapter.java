package Syahrani.si6a.uts.Armilo;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KontakViewAdapter extends RecyclerView.Adapter<KontakViewAdapter.ViewHolder> {
    @NonNull
    @Override
    public KontakViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemKontakBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false ));
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder {
    }
}

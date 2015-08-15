package tabbed.actionbar.xu.com.actionbartabbed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentProduct extends Fragment {

    View rootView;
    Button btn_product;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_product, container, false);

        btn_product = (Button) rootView.findViewById(R.id.btn_product);
        btn_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Product added", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}

package tabbed.actionbar.xu.com.actionbartabbed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentClient extends Fragment {

    View rootView;
    Button btn_client;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_client, container, false);

        btn_client = (Button) rootView.findViewById(R.id.btn_client);
        btn_client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Client created", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}

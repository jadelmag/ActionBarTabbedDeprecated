package tabbed.actionbar.xu.com.actionbartabbed;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();

        /**SHOW TITLE & SUBTITLE**/

        actionBar.setTitle("ActionBar Tabbed Deprecated");
        actionBar.setSubtitle("kientienemibarraespaciadora@gmail.com");


        /**MODO TABS IN ACTIONBAR**/
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        /**CREATE TABS**/
        ActionBar.Tab tab = actionBar.newTab()
                .setText("Products")
                .setTabListener(new TabsListener(this, "products", FragmentProduct.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("Clients")
                .setTabListener(new TabsListener(this, "clients", FragmentClient.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("Orders")
                .setTabListener(new TabsListener(this, "orders", FragmentOrder.class));
        actionBar.addTab(tab);

    }

    public class TabsListener implements ActionBar.TabListener {

        private Fragment fragment;
        private final String tag;

        public TabsListener(Activity activity, String tag, Class cls) {
            this.tag = tag;
            fragment = Fragment.instantiate(activity, cls.getName());
        }

        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(android.R.id.content, fragment, tag);
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(fragment);
        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {}
    }



}



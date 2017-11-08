package test.huangweishui.com.mytestproject;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.umeng.commonsdk.UMConfigure;

import test.huangweishui.com.common.utils.ChannelUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        setContentView(R.layout.activity_main);
        UMConfigure.init(this, "", ChannelUtil.getChannel(this), UMConfigure.DEVICE_TYPE_PHONE, "");
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");


    }
}

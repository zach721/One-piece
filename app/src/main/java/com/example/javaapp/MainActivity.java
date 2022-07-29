package com.example.javaapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import android.app.WallpaperManager;
import android.app.WallpaperManager;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Number num = 0;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*My app*/
        img = findViewById(R.id.imageView);
        String[] url = { /*luffy*/
"https://i.pinimg.com/originals/46/70/c0/4670c0f2ff4e964c1fd71bf8eff40630.jpg",
                "https://pbs.twimg.com/media/DDq0GBNXYAAAQ_z?format=jpg&name=4096x4096",
                "https://static.wikia.nocookie.net/onepiece/images/5/5c/Monkey_D._Luffy_Manga_Dos_A%C3%B1os_Despu%C3%A9s_Infobox.png/revision/latest?cb=20150529153558&path-prefix=es",
                "https://pbs.twimg.com/media/FDL4ZgaWUAYyYPD?format=jpg&name=large",
                "https://i.pinimg.com/474x/fa/eb/98/faeb9803c4ca70d21e50403e2b283f63.jpg",
                "https://live.staticflickr.com/3746/10243036954_30be9dc74f_b.jpg",
                "https://static.zerochan.net/Monkey.D..Luffy.full.25927.jpg",
                "https://pbs.twimg.com/media/FWlukwnWIAAQEnw.jpg",
                "https://i.pinimg.com/originals/5c/83/5f/5c835f0c37a46d2927f748d4dcadf723.jpg",
                "https://i.pinimg.com/564x/3e/83/3f/3e833f77b3ac45885a52d199f4ae78ba.jpg",
                "https://i.pinimg.com/originals/13/72/1f/13721f548887dc40ca0bffee62d57659.jpg",
                "https://64.media.tumblr.com/4cc4dc79eb10aaac953ca584cc688ce2/tumblr_nkuxjyzYj11u6www0o1_1280.jpg",
                "https://64.media.tumblr.com/437234a6b8e8262cdc3af0bbff1387ec/tumblr_no5gwn9g0h1u6www0o1_1280.png",
                "https://pbs.twimg.com/media/FMUJljVWUAAOBVD.jpg",
                "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/587629c5-f4e8-46e6-a1b0-5495f4be41d6/dbnsdqk-835aad0b-4e84-46f4-b3ab-51306ad32a91.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU4NzYyOWM1LWY0ZTgtNDZlNi1hMWIwLTU0OTVmNGJlNDFkNlwvZGJuc2Rxay04MzVhYWQwYi00ZTg0LTQ2ZjQtYjNhYi01MTMwNmFkMzJhOTEucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.XuRJnrjr0MOTlQJQ3zoq2fDlzXyZsq02HVk_MKEfaG8",
                "https://i.pinimg.com/originals/8a/a1/94/8aa194d2dc5d701928f7b68db6ca2df8.png",
                "https://i.pinimg.com/564x/79/6c/b2/796cb2d323ee9ec4c5220c4f1f7ab0ff.jpg",
                "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/38391644-e01a-4045-b977-2ce5d45ad807/d9v99up-9b5628b2-2bc6-4dde-9d82-3d63df6a068f.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzM4MzkxNjQ0LWUwMWEtNDA0NS1iOTc3LTJjZTVkNDVhZDgwN1wvZDl2OTl1cC05YjU2MjhiMi0yYmM2LTRkZGUtOWQ4Mi0zZDYzZGY2YTA2OGYuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.jWqtLp18gZ_Zya_Sv0xszeBE_g1U7qDhRmF4Utsc1ig",
                "https://ih1.redbubble.net/image.2410886507.6754/flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
                "https://64.media.tumblr.com/d3498b1c2c36c2ae64d5c610b19bfc57/5986a37108126c37-e8/s1280x1920/8143605e5dc7c0bbb15a8835a44457a789236f58.jpg",
                "https://static.zerochan.net/Nami.%28ONE.PIECE%29.full.3131873.png",
                "https://pbs.twimg.com/media/FTIeeHHagAEPXJs?format=jpg&name=large",
                "https://pbs.twimg.com/media/FQmGbXLXIAI60-u?format=jpg&name=large",
                "https://pbs.twimg.com/media/FQeQmdTXEAESzcf?format=jpg&name=large",
                "https://pbs.twimg.com/media/FKlf5GVXoAAhy5I?format=jpg&name=large",
                "https://pbs.twimg.com/media/FJ-d7czXIAUnm31?format=jpg&name=large",
                "https://pbs.twimg.com/media/FDqtmoTXEAAMLGQ?format=jpg&name=large",
                "https://i.pinimg.com/564x/57/bc/58/57bc58edf3b79b87d6d03ba9a2080625.jpg",
                "https://pbs.twimg.com/media/E1x4pn-WYAQ8EKt?format=jpg&name=large",
                "https://i.pinimg.com/originals/cd/41/86/cd41861dcaa7a4a4b6ccf5114ba137a9.jpg",
                "https://i.ebayimg.com/images/g/0UQAAOSwa21h7MW~/s-l1600.jpg",
                "http://vignette2.wikia.nocookie.net/onepiece/images/8/8b/One_Piece_Color_Walk_1.png/revision/latest?cb=20130206005530",
                "https://i.pinimg.com/736x/33/50/22/3350223e56fd0612e6cbbb1e16a449ee.jpg",
                "https://i.pinimg.com/736x/97/10/b2/9710b24185087070aac88a199625e440.jpg",
                "https://image-cdn.hypb.st/https%3A%2F%2Fhypebeast.com%2Fimage%2F2020%2F09%2Feiichiro-oda-one-piece-gucci-lookbook-ellemen-china-info-008.jpg?q=75&w=800&cbr=1&fit=max",
                "https://sep.yimg.com/ay/animebooks-com/one-piece-color-walk-6-gorilla-art-book-10.gif",
                "https://static.zerochan.net/ONE.PIECE.full.2314606.jpg",
                "https://static.zerochan.net/One.Piece%3A.Two.Years.Later.full.2345595.jpg",
                "https://static.zerochan.net/Straw.Hat.Pirates.full.2318762.jpg",
                "https://i.pinimg.com/originals/d7/c4/96/d7c4962d84eede0fe83388745c0007fd.jpg"

        };
         Picasso.get().load(url[0]).fit()
                 .centerCrop().into(img);
         /*Events*/
        /*Advance button*/
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num = (int)num+1;
                if((int)num>39){

                    num = 0;
                }
                Picasso.get().load(url[(int) num]).fit()
                        .centerCrop().into(img);
            }
        });
        /*Back button*/
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num = (int)num-1;
                if((int)num<0){
                    num = 39;
                }
                Picasso.get().load(url[(int) num]).fit()
                        .centerCrop().into(img);

            }
        });
        /*Set wallpaper*/

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Target target = new Target() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        Log.e(TAG, "OnBitmapLoaded");
                        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                        try {
                            wallpaperManager.setBitmap(bitmap);
                        } catch (IOException e) {
                            e.printStackTrace();
                            Log.e(TAG, "IOException->" + e.getMessage());
                        }
                    }


                    @Override
                    public void onBitmapFailed(Exception e, Drawable errorDrawable) {
                        Log.e(TAG, "" + e.getMessage());
                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {
                        Log.e(TAG, "OnPrepareLoad");
                    }
                };

                Picasso.get().load(url[(int) num]).into(target);


            }
        });


    }

}
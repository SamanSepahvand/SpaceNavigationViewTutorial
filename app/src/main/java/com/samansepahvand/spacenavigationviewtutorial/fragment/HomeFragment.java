package com.samansepahvand.spacenavigationviewtutorial.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samansepahvand.spacenavigationviewtutorial.R;
import com.samansepahvand.spacenavigationviewtutorial.adapter.Adapter;
import com.samansepahvand.spacenavigationviewtutorial.adapter.DataModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<DataModel> dataModels = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        initRecyclerview();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    private void initRecyclerview() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataModels.add(new DataModel(
                "آموزش کامل کار با نقشه ها در برنامه نویسی اندروید",
                "مدرس: سامان سپهوند",
                R.drawable.googlemap,
                "نقشه ها در اندروید یکی از کلیدی ترین امکانات را در اختیار برنامه نویس قرار میدهد که بر اساس ویژگی های مشترک بین نقشه ها کار هایی از قبیل مسیر یابی،مکان یابی.تخمین مسافت . تعیین نقاط و کسب کار های اطراف خود بدون استفاده از الگوریتم پیچیده و خاصی پیاده کند .امروزه که دستگاه های هوشمند بخش جدایی ناپذیر از زندگی یک شخص شده طبیعتا یک سری کسب کار و امکانات مرتبط با این ویژگی نیز به وجود آمده به نوعی که شما با تعیین موقعیت دستگاه کاربر خواهید توانست یک لیستی از مکان های مورد نیاز کاربر را بر اساس فیلتر های داده شده نمایش دهید "
        ));


        dataModels.add(new DataModel("آموزش کامل کار با سرویس فایربیس در برنامه نویسی اندروید",
                "مدرس: سامان سپهوند",
                R.drawable.firebase,
                "سرویس فایربیس یکی از محبوب ترین سرویس ها در زمنیه های توسعه ، بالا بردن کیفیت ، و رشد هر چه بهتر برنامه شما به حساب می آید . این پلتفرم با ارائه سرویس ها و ابزار های مختلف به شما توسعه دهنده در جهت بالا بردن موارد بالا کمک شایان و قابل توجهی میکند . سرویس هایی نظیر پایگاه داده های بدون درنگ ، سرویس های ذخیره ساز ، احراز هویت و پوش نوتیفیکیشن و ..... از انواع این ابزار ها می باشد. و در دوره پیش رو شما با تهیه این دوره آموزشی می توانید اکثر سرویس ها و ابزار های فایربیس را در اپلیکیشن خود پیاده سازی کرده و از آنها به نحو صحیح استفاده کنید."
        ));

        dataModels.add(new DataModel("طراحی اپلیکیشن اندروید همراه با پنل کاربری ASP.net MVC",
                "مدرس: سامان سپهوند",
                R.drawable.asp_mvc,
                "حال در این دوره آموزشی نحوه ایجاد این نوع از اپلیکیشن ها توضیح داده شده و شما با تهیه این دوره آموزشی قادر خواهید بود 0 تا 100 مراحل ساخت اپلیکیشن خود به همراه پنل کاربری ASP.net را انجام داده و اپلیکیشن خود را منتشر کرده و آن را به راحتی مدیریت و کنترل کنید.و حتی قادر خواهید بود با استفاده از سورس کد های نمونه داخل دوره اپلیکیشنی با حوزه کاربرد های مختلف برای خود و حتی دیگران طراحی کنید!"
        ));


        dataModels.add(new DataModel(
                "ساخت اپلیکیشن اندروید + پنل مدیریت PHP ساده",
                "مدرس: سامان سپهوند",
                R.drawable.application_php_panel,
                "طراحی اپلیکیشن هایی که داده ها و اطلاعات خود را از سمت سرور و به طور کلی از یک پنل مدیریتی(کاربری) دریافت میکنند یکی از چالش های اساسی برنامه نویسان اندروید بوده، به طوری که اکثر اپلیکیشن های موفق موجود در بازار از این نوع سبک طراحی (Server and Client) در پروژه های خود استفاده میکنند که این روش علاوه بر پیاده سازی یک متد استاندارد در زمینه طراحی اپلیکیشن ، یک مزیت ویژه در زمینه مدیریت و کنترل فرایند های در حال انجام در اپلیکیشن می باشد."
        ));


        dataModels.add(new DataModel("آموزش کامل کار با پایگاه داده Realm در اندروید",
                "مدرس: سامان سپهوند",
                R.drawable.realm,
                "فرآیند ذخیره سازی در اندورید یکی از مهم ترین ابزار ها برای بالا بردن کارایی یک اپلیکیشن به حساب می یاد به نوعی که این پایگاه داده ها میتواند نقش هایی از قبیل نگهدارنده موقت ، دائم داده ها و حتی Chash کردن داده ها از سرور را بر عهده داشته باشند. در اندروید ORM های مختلفی برای این کار وجود دارد که یکی از جدید ترین و بهترین آنها Realm می باشد که در سال 2014 توسط 2 متخصص شرکت نوکیا ایجاد شد. این دیتابیس بعد از انتشار و مقایسه با سایر پایگاه داده های مشابه نظیر SQLite محبوبیتش به شدت در بین توسعه دهندگان React Native افزایش یافته چون قابلیت استفاده بسیاری بالایی داره.Realm به دلایل بسیار زیادی از قبیل سرعت،نسخه پایدار و … بهتر از SQLite برای استفاده در React Native است."
        ));


        dataModels.add(new DataModel("مدیریت پایگاه داده ها با کتابخانه Sugar ORM در اندروید",
                "مدرس: سامان سپهوند",
                R.drawable.sugar_orm,
                "ORM یا Object Relation Mapping راه و روش مدرنی است که این اجازه را به برنامه نویس اندروید میدهد که بدون دانستن کد های Query مر بوط به به پایگاه داده به داده های آن به روشی آسان و با استفاده از یک سری Function که داخل کتابخانه تعریف شده دسترسی پیدا کند.در این روش برنامه نویس دیگر نیاز نیست"
        ));

        dataModels.add(new DataModel(
                "ساخت لیست کشویی با Spinner ها در اندروید",
                "مدرس: سامان سپهوند",
                R.drawable.spinner,
                "Spinner ها یک نوع لیست کشویی می باشد که این امکان را به کاربر می دهند که یک انتخاب را بین چند انتخاب داشته باشد و یکی از مزیت های Spinner این است که می تواند تعداد زیادی انتخاب را در خود جای دهد ولی فضای زیادی را اشغال نکند و فقط هنگامی که به آن احتیاج داریم محتویات آن نشان داده می شود"

        ));


        adapter = new Adapter(getContext(), dataModels);
        recyclerView.setAdapter(adapter);
    }


}
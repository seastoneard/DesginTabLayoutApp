# DesginTabLayoutApp

 <div class="article_content max-width100" id="article_content" class="article_content">
       <p>Google在2015的IO大会上，给我们带来了更加详细的Material Design设计规范，同时，也给我们带来了全新的Android Design Support Library，在这个support库里面，Google给我们提供了更加规范的MD设计风格的控件。最重要的是，Android Design Support Library的兼容性更广，直接可以向下兼容到Android 2.2。Tabs选项卡，效果类似网易新闻客户端的Tab。<span style="display: none; line-height: 0px;">‍</span><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px;  background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span></p>
<p><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px;  background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span><span style="display: none; line-height: 0px;">‍</span>1.使用前配置:<span style="display: none; line-height: 0px;">‍</span><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px;  background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span></p>
<p><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px;  background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span><span style="display: none; line-height: 0px;">‍</span>在AndroidStudio中使用的话，&nbsp;配置build.gradle -----&gt;compile 'com.android.support:design:22.2.0',在eclipse中的话，需导入android-support-design.jar包.<span style="display: none; line-height: 0px;">‍</span><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px; background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span></p>
<p><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px; background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span><span style="display: none; line-height: 0px;">‍</span>2.使用方式：<span style="display: none; line-height: 0px;">‍</span><span style="color: rgb(51, 51, 51); font-family: 宋体; font-size: 14px; line-height: 28px; text-indent: 28px; background-color: rgb(249, 249, 249);"><span style="display: none; line-height: 0px;">‍</span></span></p>
<pre class="brush:xml;toolbar:false">&lt;?xml&nbsp;version="1.0"&nbsp;encoding="utf-8"?&gt;
&lt;LinearLayout&nbsp;xmlns:android="http://schemas.android.com/apk/res/android"
&nbsp;&nbsp;&nbsp;&nbsp;xmlns:app="http://schemas.android.com/apk/res-auto"
&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="match_parent"
&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="match_parent"
&nbsp;&nbsp;&nbsp;&nbsp;android:orientation="vertical"&gt;
&nbsp;&nbsp;&nbsp;&nbsp;&lt;android.support.design.widget.TabLayout
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/tablayout"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="match_parent"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="wrap_content"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:background="@android:color/holo_green_dark"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;app:tabIndicatorColor="@color/colorAccent"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;app:tabMode="fixed"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;app:tabSelectedTextColor="@color/tabfocus"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;app:tabTextColor="@android:color/white"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;app:tabTextAppearance="@style/tablayoutIcon"&nbsp;/&gt;
&nbsp;&nbsp;&nbsp;&nbsp;&lt;android.support.v4.view.ViewPager
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/tab_viewpager"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="match_parent"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="0dp"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_weight="1"
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:background="@android:color/white"&nbsp;/&gt;
&lt;/LinearLayout&gt;</pre>
<p>TabLayout 常用的属性有三个：</p>
<p>app:tabSelectedTextColor:&nbsp;Tab 被选中字体的颜色</p>
<p>app:tabTextColor:<span style="white-space:pre"> </span>Tab未被选中字体的颜色</p>
<p>app:tabIndicatorColor:<span style="white-space: pre;"> </span>Tab指示器下标的颜色</p>
<p>app:tabBackground: &nbsp; &nbsp; tab的背景颜色</p>
<p>app:tabTextAppearance：改变字体大小<br></p>
<p>app:tabIndicatorHeight：指示器下标的高度</p>
<p>3.代码实现：</p>
<pre class="brush:java;toolbar:false">//-----------------------------------------activity
public&nbsp;class&nbsp;TablayoutActivity&nbsp;extends&nbsp;AppCompatActivity&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;/**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;-----------------------------------&nbsp;固定的page---&gt;TabLayout
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;savedInstanceState
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/
&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;TabLayout&nbsp;tabLayout&nbsp;=&nbsp;null;
&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;ViewPager&nbsp;vp_pager;
&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Fragment[]&nbsp;mFragmentArrays&nbsp;=&nbsp;new&nbsp;Fragment[3];
&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String[]&nbsp;mTabTitles&nbsp;=&nbsp;new&nbsp;String[3];
&nbsp;&nbsp;
&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;onCreate(Bundle&nbsp;savedInstanceState)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;super.onCreate(savedInstanceState);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setContentView(R.layout.tab_layout);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tabLayout&nbsp;=&nbsp;(TabLayout)&nbsp;findViewById(R.id.tablayout);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;vp_pager&nbsp;=&nbsp;(ViewPager)&nbsp;findViewById(R.id.tab_viewpager);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fixedPager();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;void&nbsp;fixedPager()&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mTabTitles[0]&nbsp;=&nbsp;"朋友";
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mTabTitles[1]&nbsp;=&nbsp;"我的";
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mTabTitles[2]&nbsp;=&nbsp;"动态";
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//设置TabLayout的模式,这里主要是用来显示tab展示的情况的
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//TabLayout.MODE_FIXED&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;各tab平分整个工具栏,如果不设置，则默认就是这个值
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//TabLayout.MODE_SCROLLABLE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;适用于多tab的，也就是有滚动条的，一行显示不下这些tab可以用这个
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;-------------------------------事列1(固定的)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tabLayout.setTabMode(TabLayout.MODE_FIXED);//固定的
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mFragmentArrays[0]&nbsp;=&nbsp;AuthorInfoFragment.newInstance();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mFragmentArrays[1]&nbsp;=&nbsp;AuthorInfoFragment.newInstance();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mFragmentArrays[2]&nbsp;=&nbsp;AuthorInfoFragment.newInstance();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PagerAdapter&nbsp;pagerAdapter&nbsp;=&nbsp;new&nbsp;MyViewPagerAdapter(getSupportFragmentManager());
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;vp_pager.setAdapter(pagerAdapter);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//增加Tab，同时关联ViewPager
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tabLayout.setupWithViewPager(vp_pager);
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;final&nbsp;class&nbsp;MorePagerAdapter&nbsp;extends&nbsp;PagerAdapter&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;int&nbsp;getCount()&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;10;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Object&nbsp;instantiateItem(ViewGroup&nbsp;container,&nbsp;int&nbsp;position)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TextView&nbsp;tv&nbsp;=&nbsp;new&nbsp;TextView(TablayoutActivity.this);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tv.setText("ViewPager"&nbsp;+&nbsp;position);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tv.setTextSize(30.0f);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tv.setGravity(Gravity.CENTER);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;((ViewGroup)&nbsp;container).addView(tv);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;tv;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;destroyItem(ViewGroup&nbsp;container,&nbsp;int&nbsp;position,&nbsp;Object&nbsp;object)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;((ViewPager)&nbsp;container).removeView((View)&nbsp;object);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;boolean&nbsp;isViewFromObject(View&nbsp;view,&nbsp;Object&nbsp;object)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;view&nbsp;==&nbsp;object;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;CharSequence&nbsp;getPageTitle(int&nbsp;position)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"选项"&nbsp;+&nbsp;position;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;}
//======================fragment
public&nbsp;class&nbsp;AuthorInfoFragment&nbsp;extends&nbsp;Fragment&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;Fragment&nbsp;newInstance()&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AuthorInfoFragment&nbsp;fragment&nbsp;=&nbsp;new&nbsp;AuthorInfoFragment();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;fragment;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;@Override
&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;View&nbsp;onCreateView(LayoutInflater&nbsp;inflater,&nbsp;ViewGroup&nbsp;container,&nbsp;Bundle&nbsp;savedInstanceState)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//需要利用实现了嵌套滚动机制的控件，才能出现AppBarLayout往上推的效果
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View&nbsp;rootView&nbsp;=&nbsp;inflater.inflate(R.layout.fragment_author_info,&nbsp;container,&nbsp;false);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RecyclerView&nbsp;recyclerView&nbsp;=&nbsp;(RecyclerView)&nbsp;rootView.findViewById(R.id.recycler_view);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LinearLayoutManager&nbsp;layoutManager&nbsp;=&nbsp;new&nbsp;LinearLayoutManager(getActivity());
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recyclerView.setLayoutManager(layoutManager);&nbsp;&nbsp;&nbsp;&nbsp;//若用其他风格显示---需定义LinearLayoutManager显示类型
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recyclerView.setAdapter(new&nbsp;AuthorRecyclerAdapter());
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;rootView;
&nbsp;&nbsp;&nbsp;&nbsp;}
}
&nbsp;/**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;TabLayout的属性：
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;addTab(TabLayout.Tab&nbsp;tab,&nbsp;int&nbsp;position,&nbsp;boolean&nbsp;setSelected)&nbsp;增加选项卡到&nbsp;layout&nbsp;中
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;addTab(TabLayout.Tab&nbsp;tab,&nbsp;boolean&nbsp;setSelected)&nbsp;同上
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;addTab(TabLayout.Tab&nbsp;tab)&nbsp;同上
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getTabAt(int&nbsp;index)&nbsp;得到index选项卡
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getTabCount()&nbsp;得到选项卡的总个数
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getTabGravity()&nbsp;得到&nbsp;tab&nbsp;的&nbsp;Gravity
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getTabMode()&nbsp;得到&nbsp;tab&nbsp;的模式
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;getTabTextColors()&nbsp;得到&nbsp;tab&nbsp;中文本的颜色
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;newTab()&nbsp;新建个&nbsp;tab
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;removeAllTabs()&nbsp;移除所有的&nbsp;tab
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;removeTab(TabLayout.Tab&nbsp;tab)&nbsp;移除指定的&nbsp;tab
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;removeTabAt(int&nbsp;position)&nbsp;移除指定位置的&nbsp;tab
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setOnTabSelectedListener(TabLayout.OnTabSelectedListener&nbsp;onTabSelectedListener)&nbsp;为每个&nbsp;tab&nbsp;增加选择监听器，稍候会讲解其回调方法
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setScrollPosition(int&nbsp;position,&nbsp;float&nbsp;positionOffset,&nbsp;boolean&nbsp;updateSelectedText)&nbsp;设置滚动位置
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setTabGravity(int&nbsp;gravity)&nbsp;设置&nbsp;Gravity（fill填充，center居中）
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setTabMode(int&nbsp;mode)&nbsp;设置&nbsp;Mode（设置可否滑动，scrollable可滑动）
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setTabTextColors(ColorStateList&nbsp;textColor)&nbsp;设置&nbsp;tab&nbsp;中文本的颜色
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setTabTextColors(int&nbsp;normalColor,&nbsp;int&nbsp;selectedColor)&nbsp;设置&nbsp;tab&nbsp;中文本的颜色&nbsp;默认&nbsp;选中
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setTabsFromPagerAdapter(PagerAdapter&nbsp;adapter)&nbsp;设置&nbsp;PagerAdapter
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setupWithViewPager(ViewPager&nbsp;viewPager)&nbsp;和&nbsp;ViewPager&nbsp;联动
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</pre>
<p style="text-align:center"><img src="http://devstorepic.qiniudn.com/Foilrt09kHPg2Oge0Ng1eEmrMsP2" width="376" height="593" title=""></p>
<p>//具体实现代码在：<a href="http://www.devstore.cn/code/info/1714.html">http://www.devstore.cn/code/info/1714.html</a></p>
<p><span style="color: rgb(47, 47, 47); font-family: 'lucida grande', 'lucida sans unicode', lucida, helvetica, 'Hiragino Sans GB', 'Microsoft YaHei', 'WenQuanYi Micro Hei', sans-serif; line-height: 27.2px;  background-color: rgb(255, 255, 255);"></span></p>
    </div>
    
  <!--Baidu Button BEGIN-->
  

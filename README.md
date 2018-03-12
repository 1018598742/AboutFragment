fragment 添加到回退栈中

```
 FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
 
 fragmentTransaction.replace(R.id.content_fl, new MyFragment());
 
 fragmentTransaction.addToBackStack(null);
 
 fragmentTransaction.commit();

```
获取栈中的数目

```
int backStackEntryCount = getActivity().getSupportFragmentManager().getBackStackEntryCount();
```

清空栈

```
getActivity().getSupportFragmentManager().popBackStackImmediate(null,1);
```

>可以直接在 activity 中使用清空栈，它会只留下底部的一个 fragment，清空上面所有的 fragment。

# Fragment 生命周期

```
由 fragment 1 使用 addToBackStack 跳转到 fragment 2

03-12 17:42:59.409 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment:  onAttach: one
03-12 17:42:59.409 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onCreate: one
03-12 17:42:59.409 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onCreateView: one
03-12 17:42:59.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onViewCreated: one
03-12 17:42:59.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onStart: one
03-12 17:42:59.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onResume: one
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onPause: one
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onStop: one
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onDestroyView: one
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment:  onAttach: two
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onCreate: two
03-12 17:45:12.619 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onCreateView: two
03-12 17:45:12.639 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onViewCreated: two
03-12 17:45:12.639 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onStart: two
03-12 17:45:12.639 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onResume: two

使用清空栈 getSupportFragmentManager().popBackStackImmediate(null,1);

03-12 17:47:11.389 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onPause: two
03-12 17:47:11.389 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onStop: two
03-12 17:47:11.389 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onDestroyView: two
03-12 17:47:11.389 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onDestroy: two
03-12 17:47:11.389 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onDetach: two
03-12 17:47:11.399 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onCreateView: one
03-12 17:47:11.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onViewCreated: one
03-12 17:47:11.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onStart: one
03-12 17:47:11.419 14944-14944/kedaxunfei.fta.com.testfragment I/about_fragment: onResume: one


```

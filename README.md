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
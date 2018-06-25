# GetIdentifierDemo
getIdentifier方法的封装类StrManager.java，主要目的为了在一个项目中需要在多套strings之间切换时方便切换用。

男性模式的时候用strings_male里面的字符串，

女性模式的时候用strings_femal里面的字符串。

改变就是在StrManager.java的getString方法里面修改后缀即可。

# 为啥用这个？

直接获取方式String hobbys = this.getString(R.string.hobby_male);
管理类获取方式String hobby = StrManager.getInstance().getString("hobby");
为什么用后者，可能就是方便在多套strings之间切换吧。
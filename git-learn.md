## IDEA中使用Git

IDEA 中添加 Git：点击 VCS 选择 Git 即可

- 红色文件表示还没添加到暂存区，蓝色文件表示被追踪过，修改该文件后，在add到暂存区commit到本地库
- 点击 Git->Add 后，变成绿色（到暂存区中还没提交到本地库）
- 点击 Git->Commit Directory / File -> commit，变成黑色（成功提交到本地库）

模拟多版本
- 蓝色文件，被追踪过可以不add,直接commit也行
- 查看提交过的版本，点击 git---log
- 切换版本：直接右键点击 checkout ...(黄色指针即头指针，master即当前分支的指针)


分支操作
- 创建分支：git -- branches  或 idea右下角 master ===> 创建分支，checkout 并切换过去
- 查看提交过的版本，点击 git---log
- 切换版本：直接右键点击 checkout ...(黄色指针即头指针，master即当前分支的指针)

- 当前为hot - fix分支，演示合并分支（master分支没改）
- 演示站在master分支下，合并hot-fix分支

- 学习解决合并时发生的冲突。当我在hot-fix 修改提交后，master分支也修改提交了，合并时就需要选择（冲突）

# 项目启动步骤
1. 首先赋予所有命令权限
2. build.sh用于mvn构建项目jar包.
3. 然后直接运行start.sh用于启动容器的镜像（由于我拉公司的镜像有问题，用的自己构建的java镜像和mysql提供的镜像mysql:5.7）
4. 当容器起来以后，运行curl命令，调用接口等执行操作。
5. 最后启动stop.sh用来关闭容器并且查看java日志。
```
chmod 777 build.sh
chmod 777 start.sh
chmod 777 stop.sh
```
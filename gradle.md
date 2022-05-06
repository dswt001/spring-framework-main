# Gradle study

## Gradle 简介
官网：https://docs.gradle.org/current/userguide/installation.html#installation
Gradle 是一个专注于灵活性和性能的开源构建自动化工具。Gradle 构建脚本是使用Groovy或Kotlin DSL 编写的。
项目构建工具，和 maven 有些类似，但是差异也不小。


## Gradle 优点
1. 按约定声明构建和建设；
2. 强大的支持多工程的构建；
3. 强大的依赖管理（基于Apache Ivy），提供最大的便利去构建工程；
4. 全力支持已有的 Maven 或者Ivy仓库基础建设；
5. 支持传递性依赖管理，在不需要远程仓库和pom.xml和ivy配置文件的前提下；
6. 基于groovy脚本构建，其build脚本使用groovy语言编写；
7. 具有广泛的领域模型支持构建；
8. 深度 API；
9. 易迁移；
10. 自由和开放源码，Gradle是一个开源项目，基于 ASL 许可。
    ————————————————
    版权声明：本文为CSDN博主「陈袁」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    原文链接：https://blog.csdn.net/achenyuan/article/details/80682288

## Gradle 环境配置
下载地址：https://gradle.org/releases/
1. 下载 Zip；
2. 解压；
3. 配置系统环境变量：新建系统环境“GRADLE_HOME”，找到path变量，后面添加%GRADLE_HOME%\bin;。
4. cmd中输入 gradle -v 测试安装是否成功。

## idea 配置
file->setting->Build,Execution,Deployment->Gradle



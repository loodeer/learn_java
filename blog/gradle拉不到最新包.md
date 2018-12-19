gradle拉不到最新包
============

clone 了公司售后服务化的代码，启动项目，报错有个 Zookeeper 的类找不到。查看 External Libraries 是缺少 org.apache.zookeeper 依赖。

### 排错方法

	$ gradle idea --refresh-dependencies  -debug > /tmp/gradle_log
	
	
```
11:34:12.349 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.zookeeper:zookeeper:3.4.6 using repositories [MavenLocal, maven, maven2]
11:34:12.349 [DEBUG] [org.gradle.api.internal.artifacts.repositories.resolver.DefaultExternalResourceArtifactResolver] Loading file:/Users/loodeer/.m2/repository/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.pom
11:34:12.350 [DEBUG] [org.gradle.api.internal.artifacts.repositories.resolver.ExternalResourceResolver] Metadata file found for module 'org.apache.zookeeper:zookeeper:3.4.6' in repository 'MavenLocal'.
11:34:12.350 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.DefaultModuleMetadataCache] Recording module descriptor in cache: org.apache.zookeeper:zookeeper:3.4.6 [changing = false]
11:34:12.351 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.zookeeper:zookeeper:3.4.6 from Maven repository 'MavenLocal'
11:34:12.351 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.zookeeper:zookeeper:3.3.3(runtime).
11:34:12.351 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] version for org.apache.zookeeper:zookeeper:3.3.3(runtime) is not selected. ignoring.
```

问题出在，MavenLocal 本地仓库。

把项目里 gradle.build 里面， MavenLocal() 注释掉，再 gradle build 就能拉到 org.apache.zookeeper 包了。

```
repositories {
        //mavenLocal()
        maven {
            url = 'xxxxxx'
        }
        maven { url "xxxxxx" }
    }
```


zookeeper 3.4.6 下缺失 .jar 文件。
	
```
☁  3.4.6  ll
total 24
-rw-r--r--  1 luzuheng  staff   155B  3 29  2017 _maven.repositories
-rw-r--r--  1 luzuheng  staff   3.3K  3 29  2017 zookeeper-3.4.6.pom
-rw-r--r--  1 luzuheng  staff    40B  3 29  2017 zookeeper-3.4.6.pom.sha1
```
	
删除 3.4.6 文件夹后重新刷新依赖解决

```
☁  1b2502e29da1ebaade2357cd1de35a855fa3755  pwd
/Users/luzuheng/.gradle/caches/modules-2/files-2.1/org.apache.zookeeper/zookeeper/3.4.6/1b2502e29da1ebaade2357cd1de35a855fa3755
☁  1b2502e29da1ebaade2357cd1de35a855fa3755  ls
zookeeper-3.4.6.jar
```

	
	
	

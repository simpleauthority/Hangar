package io.papermc.hangar.serviceold;

import io.papermc.hangar.db.dao.HangarDao;
import io.papermc.hangar.db.daoold.JobDao;
import io.papermc.hangar.db.modelold.JobsTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final HangarDao<JobDao> jobDao;

    @Autowired
    public JobService(HangarDao<JobDao> jobDao) {
        this.jobDao = jobDao;
    }

    public List<JobsTable> getErroredJobs() {
        return jobDao.get().getErroredJobs();
    }
}